package com.funtalk.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.funtalk.pojo.IpCustPort;
import com.funtalk.pojo.TbPIpMap;
import com.funtalk.pojo.TbSChangeiccid;

import com.funtalk.pojo.TbSEjoinrecords;
import com.funtalk.service.EJoinService;
import com.funtalk.service.EjoinRecordsService;
import com.funtalk.utils.HttpClient4;
import java.util.Map.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;


@Controller
public class EJoinController {

    @Autowired
    EJoinService eJoinService;

    @Autowired
    EjoinRecordsService ejoinRecordsService;

    @Autowired
    TbSEjoinrecords tbSEjoinrecords;
    //  1--æ¨åºæªæ¥é?2--æ¥éæªææ­ 3--ææ­
    static Map<String,Integer>  callflag= new HashMap();

    @RequestMapping("/api/ejoin/ejtest1")
    @ResponseBody
    public void test(@RequestBody Map<String, Object> map) {
        String type=(String)map.get("type");

//        if(type.equals("dev-status")) {
//
//        ArrayList<LinkedHashMap> status = (ArrayList<LinkedHashMap>) map.get("status");
//        String ip=(String)map.get("ip");
//            String fmt="yyyy-MM-dd hh:mm:ss";
//            SimpleDateFormat sdf=new SimpleDateFormat(fmt);
//
//        System.out.println(eJoinService.localMap(ip).getPublic_()+"\r\n"+
//                "recieve "+type+" report!!------------------------------"+sdf.format(new Date()));
//
//            for(int i=0;i<status.size();i++) {
//
//                System.out.println(status.get(i));
//            }
//
//        }

        if(type.equals("cdr")) {
            Set<Entry<String, Object>> set = map.entrySet();
            for(Entry<String,Object> entry:set){
                System.out.println(entry.getKey()+":"+entry.getValue()+"---"+entry.getValue().getClass());
            }
        }
    }

    //æ°æºå¨åå§å
//    @RequestMapping("/ejoin/pushCard")
//    public String write(String ip) {
//
//        //  1.è·å32*9å¼ å¡
//        List<TbSChangeiccid> list;
//        synchronized (list= eJoinService.getDetail("void",-1,32 * 9)) {
//            //æ´æ°ç¶æ?
//            eJoinService.statusUp(0, list);
//        }
//
//        //  æ´æ°å¡çip
//        eJoinService.fetchCard(ip,list);
//        //åå¡è®¡æ°å?
//        int sum = 0;
//        //ç«¯å£
//        int port = 1;
//        //é»è¾éé
//        String cluster = "";
//
//        String[] datas = new String[4];
//
//        boolean flag;
//        TbPIpMap tbPIpMap =eJoinService.localMap(ip);
//        ip=tbPIpMap.getPublic_();
//        String userName="";
//        String password="";
//        userName=tbPIpMap.getUserName();
//        password=tbPIpMap.getPassword();
//        for (TbSChangeiccid tbSChangeiccid : list) {
//            cluster = CCHOMethod("" + port,ip,userName,password);
//            if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {
//                //æç§ç«¯å£åå¡
//                //æ´æ°ç«¯å£
//
//                    eJoinService.portUp("" + port, ip, tbSChangeiccid.getTbSPhone().getIccid());
//
//                //åå¡
//                datas[0] = tbSChangeiccid.getTbSPhone().getData1();
//                datas[1] = tbSChangeiccid.getTbSPhone().getData2();
//                datas[2] = tbSChangeiccid.getTbSPhone().getData3();
//                datas[3] = tbSChangeiccid.getTbSPhone().getData4();
//                for (int i = 0; i < 3; i++) {
//                    flag = CGLAMethod("" + port, cluster, datas[i],ip,userName,password);
//                    if (!flag) {
//                        return "åå¡å¤±è´¥";
//                    } else {
//                        sum++;
//                    }
//                }
//                CCHCMethod(""+port,cluster,ip,userName,password);
//                if (sum == 9) {
//                    port++;
//                    sum = 0;
//
//                }
//            } else {
//                return "æå¼é»è¾ééå¼å¸¸";
//            }
//        }
//        return "success";
//    }

    //èµæºåé
    @RequestMapping("/ejoin/distribute")
    public void distribute(@RequestParam(value="IPPorts",required = false)String IPPorts, @RequestParam("cust_id") String cust_id,@RequestParam(value = "num",defaultValue = "0" )String num){
        if(IPPorts!=null&&IPPorts!="") {
            String[] arr = IPPorts.split(",");
            String ip = "";
            String port = "";
            for (String IPPort : arr) {
                System.out.println(IPPort);
                ip = IPPort.substring(0, IPPort.indexOf("-"));
                port = IPPort.substring(IPPort.indexOf("-") + 1, IPPort.length());
                eJoinService.name(cust_id, port, ip);
            }
            int n=0;
            n=Integer.parseInt(num);
            if(n!=0){
                n = n - arr.length;
                synchronized(this) {
                    List<TbSChangeiccid> list = eJoinService.getDetail("void", -1, n);

                    for (TbSChangeiccid tbSChangeiccid : list) {
                        eJoinService.name(cust_id, tbSChangeiccid.getIccid());
                    }
                }
            }
        }

    }


    //æ¥æ¶ä¸æ­£è®¾å¤æ¥å?
    @RequestMapping("/api/ejoin/report")
    @ResponseBody
    public void getReport(@RequestBody Map<String, Object> map) {
        try {
            String type = (String) map.get("type");
            // ä¸æ­£æå¤ä¸ªTypeçæ¥åï¼è·åcdrç±»çæ¥å
            if (type.equals("cdr")) {
                String iccid;
                int answer;
                int end;
                answer=(int)map.get("answer");
                end=(int)map.get("end");
                iccid=(String)map.get("iccid");


                if(answer==0&&end==0){
                    callflag.put(iccid,1);
                }else if(answer!=0&&end==0){
                    callflag.put(iccid,2);
                }else if(answer!=0&&end!=0){
                    callflag.put(iccid,3);

                    int begin;
                    String reason="";
                    String ip;
                    String port;
                    int alert;
                    String caller;
                    String callee;


                    port=(String)map.get("port");
                    port=port.substring(0,port.indexOf("."));
                    ip=(String) map.get("ip");
                    TbPIpMap tbPIpMap =eJoinService.localMap(ip);
                    ip=tbPIpMap.getPublic_();

                    begin=(int)map.get("begin");

                    alert=(int)map.get("alert");
                    reason=(String)map.get("reason");
                    callee=(String)map.get("callee");

                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                    tbSEjoinrecords.setAlert(sdf.format(new Date((long)alert*1000)));
                    tbSEjoinrecords.setAnswer(sdf.format(new Date((long)answer*1000)));
                    tbSEjoinrecords.setBegin(sdf.format(new Date((long)begin*1000)));
                    tbSEjoinrecords.setCallee(callee);

                    tbSEjoinrecords.setEnd(sdf.format(new Date((long)end*1000)));
                    tbSEjoinrecords.setIp(ip);
                    tbSEjoinrecords.setPort(port);
                    tbSEjoinrecords.setReason(reason);



                    String userName="";
                    String password="";
                    //ç©ºé²å?
                    TbSChangeiccid otherCard = new TbSChangeiccid();
                    String cluster = "";



                    System.out.println("ip-------"+ip+"-------port:"+port+"-------dial finished");
                    userName=tbPIpMap.getUserName();
                    password=tbPIpMap.getPassword();

                    String[] datas=new String[4];
                    long used=0;
                    used=(end-answer)/60;
                    if(end-answer%60>0)
                        used++;

                    //æ´æ°å¡çæ¥ä½¿ç¨éãæä½¿ç¨é?
                    eJoinService.reportUp((double)used, (double)used, iccid);
                    //è·åå½åçæå¡å®ä½?
                    TbSChangeiccid thisCard = eJoinService.findByIccid(iccid);

                    tbSEjoinrecords.setCaller(thisCard.getPhoneNum());
                    ejoinRecordsService.insertRecord(tbSEjoinrecords);
                    //è¶é
                    if ( thisCard.getDayDur()>=thisCard.getDayMax()  || thisCard.getMonDur() >= thisCard.getMonMax()) {
                        System.out.println("-------------------start switch-------------------");
                        //éå®ç«¯å£
                        OPMethod(port, ip, userName, password, "lock");
                        CCHCMethod(thisCard.getPort(),"1",thisCard.getIp(),userName,password);
                        CCHCMethod(thisCard.getPort(),"2",thisCard.getIp(),userName,password);
                        CCHCMethod(thisCard.getPort(),"3",thisCard.getIp(),userName,password);
                        if (callflag.get(iccid) == 3) {
                            cluster = CCHOMethod(port, ip, userName, password);
                            if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {

                                synchronized (this) {
                                    //åç«¯å£ç¨å®æ¾å®¢æ·åä¸ç©ºé²å?
                                    try {
                                        otherCard = eJoinService.getDetail(thisCard.getCustId(), -1, 1).get(0);
                                    }catch (NullPointerException e) {
                                        System.out.println("all resource has been consumed");
                                        return;
                                    }

                                    //åå¡
                                    if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {
                                        datas[0] = otherCard.getTbSPhone().getData1();
                                        datas[1] = otherCard.getTbSPhone().getData2();
                                        datas[2] = otherCard.getTbSPhone().getData3();
                                        datas[3] = otherCard.getTbSPhone().getData4();
                                        for (int i = 0; i < 4; i++) {
                                            if (!CGLAMethod("" + port, cluster, datas[i], ip, userName, password)) {
                                                System.out.println(ip + ":" + port + "write " + otherCard.getIccid() + " error");
                                                return;
                                            }
                                        }
                                        CCHCMethod(port, cluster, ip, userName, password);
                                        cluster = CCHOMethod(port, ip, userName, password);
                                    }
                                    //åå¡
                                    if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {
                                        if (!CGLAMethod("" + port, cluster, otherCard.getTbSPhone().getChangedata(), ip, userName, password)) {
                                            eJoinService.upByIccid(ip, port, 0, otherCard.getIccid());
                                            System.out.println(ip + ":" + port + "switch " + otherCard.getIccid() + " error");
                                            return;
                                        }
                                        //æ´æ°ç¶æ?
                                        eJoinService.upByIccid(ip, port, 1, otherCard.getIccid());
                                        eJoinService.upByIccid("", "", 0, iccid);
                                    }

                                    Thread.sleep(25000);

                                        //å å¡
//                                        do{
//                                            cluster = CCHOMethod(port, ip, userName, password);
//                                        }
//                                        while(!cluster.equals("1") && !cluster.equals("2") && !cluster.equals("3"));

                                    cluster = CCHOMethod(port, ip, userName, password);
                                    if (!CGLAMethod("" + port, cluster, thisCard.getTbSPhone().getDeldata(), ip, userName, password)) {
                                        System.out.println(ip + ":" + port + "delete " + iccid + " error");
                                        return;
                                    }
                                    //ææ§å¡ç¶æ\ipæ´æ°ä¸?1
                                    eJoinService.upByIccid("0", "0", -1, iccid);
                                    CCHCMethod(port, cluster, ip, userName, password);
                                    OPMethod(port, ip, userName, password, "unlock");
                                    System.out.println("-------------------switch finished-------------------");
                                }
                            }else {
                                System.out.println("open cluster error");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    @RequestMapping("/ejoin/recover")
    public String recover(@RequestParam("cust_id")String cust_id){
        eJoinService.recover(cust_id);
        return "redirect:/ejoin/ips";
    }



    @RequestMapping("/ejoin/ips")
    public String ips(Model model){
        Map<String,String> map=new HashMap<>();
        Set<String> ipset=new HashSet<>();
        List<TbSChangeiccid> cards=eJoinService.cards();


        List<List<IpCustPort>> datas=new ArrayList<>();
        for (int i=0;i<cards.size();i++){
            ipset.add(cards.get(i).getIp());
        }
        Iterator<String> ipit=ipset.iterator();
        String ip="";
        while(ipit.hasNext()){
            ip=ipit.next();
            List<IpCustPort> arrlist=new ArrayList<>();

            for(TbSChangeiccid card:cards){
                IpCustPort ipCustPort=new IpCustPort();
                if(ip.equals(card.getIp())){
                    ipCustPort.setIp(card.getIp());
                    ipCustPort.setPort(card.getPort());
                    ipCustPort.setCust_id(card.getCustId());
                    ipCustPort.setPhone_num(card.getPhoneNum());
                    arrlist.add(ipCustPort);
                }
            }
            datas.add(arrlist);
        }
        model.addAttribute("datas",datas);
        return "ejoin/manage";
    }

    @RequestMapping("/ejoin/queryAll1")
    public String quearyAll1(@RequestParam("cust_id")String cust_id,Model model){
        List<TbSChangeiccid> cards=eJoinService.queryAll(cust_id);
        int total=cards.size();
        Set<String> ips=new HashSet<>();

        for(TbSChangeiccid card:cards){
            if(card.getPort()!=null&&!card.getPort().equals("")&&!card.getPort().equals("0")&&!card.getIp().equals("0")&&card.getIp()!=null&&card.getIp().length()>0) {
                ips.add(card.getIp());
            }
        }
        Map<String,List<String>> map=new HashMap<>();
        for(String ip:ips){

            List<String> ports=new ArrayList<>();
            for(TbSChangeiccid card:cards){

                if(ip.equals(card.getIp())){
                   ports.add(card.getPort());
                }
            }
            map.put(ip,ports);
        }

        model.addAttribute("total",total);
        model.addAttribute("IPPort",map);
        model.addAttribute("cust_id",cust_id);
        return "/ejoin/watcher";
    }

    @RequestMapping("/ejoin/forceChange")
    @ResponseBody
    public String forceChange(@RequestParam("cust_id")String cust_id) throws InterruptedException {
        //è·åææå½åçæå¡
        List<TbSChangeiccid> cards=eJoinService.queryAll(1,cust_id);
        String cluster="";
        String[] datas=new String[4];
        boolean flag=false;
        String userName="";
        String password="";
        //è·åç­éå¨å¤å?
        List<TbSChangeiccid> newcards = eJoinService.getDetail(cust_id, -1, cards.size());
        if(cards!=null&&cards.size()!=0&&cards.size()==newcards.size()){
            for(int i=0;i<cards.size();i++){
                TbPIpMap tbPIpMap =eJoinService.public_Map(cards.get(i).getIp());
                if(tbPIpMap!=null&&cards.size()!=0){
                userName=tbPIpMap.getUserName();
                password=tbPIpMap.getPassword();
                if(cards.get(i).getPort()!=null&&cards.get(i).getPort().length()!=0) {
                    OPMethod(cards.get(i).getPort(),cards.get(i).getIp(),userName,password,"lock");
                    CCHCMethod(cards.get(i).getPort(),"1",cards.get(i).getIp(),userName,password);
                    CCHCMethod(cards.get(i).getPort(),"2",cards.get(i).getIp(),userName,password);
                    CCHCMethod(cards.get(i).getPort(),"3",cards.get(i).getIp(),userName,password);
                    cluster = CCHOMethod(cards.get(i).getPort(), cards.get(i).getIp(),userName,password);
                    if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {

                        datas[0] = newcards.get(i).getTbSPhone().getData1();
                        datas[1] = newcards.get(i).getTbSPhone().getData2();
                        datas[2] = newcards.get(i).getTbSPhone().getData3();
                        datas[3] = newcards.get(i).getTbSPhone().getData4();
                        for (int j = 0; j < 4; j++) {
                            flag = CGLAMethod(cards.get(i).getPort(), cluster, datas[j], cards.get(i).getIp(),userName,password);
                            if (!flag) {
                                System.out.println(newcards.get(i).getIccid()+"write error");
                                return "åå¡å¼å¸¸";
                            }
                        }
                        CCHCMethod(cards.get(i).getPort(), cluster, cards.get(i).getIp(),userName,password);
                        cluster = CCHOMethod(cards.get(i).getPort(), cards.get(i).getIp(),userName,password);
                        if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {
                            if(!CGLAMethod(cards.get(i).getPort(), cluster, newcards.get(i).getTbSPhone().getChangedata(), cards.get(i).getIp(),userName,password)) {
                                eJoinService.upByIccid(cards.get(i).getIp(),cards.get(i).getPort(),0,newcards.get(i).getIccid());
                                System.out.println("switch error");
                                return "åå¡å¼å¸¸";
                            }
                            eJoinService.upByIccid(cards.get(i).getIp(),cards.get(i).getPort(),1,newcards.get(i).getIccid());
                            eJoinService.upByIccid("","",0,cards.get(i).getIccid());
                        }
                        Thread.sleep(25000);
                        cluster = CCHOMethod(cards.get(i).getPort(), cards.get(i).getIp(),userName,password);
                        if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {
                            if(!CGLAMethod(cards.get(i).getPort(),cluster,cards.get(i).getTbSPhone().getDeldata(),cards.get(i).getIp(),userName,password)){
                                System.out.println("del error");
                                return "å å¡å¼å¸¸";
                            }
                            CCHCMethod(cards.get(i).getPort(), cluster, cards.get(i).getIp(),userName,password);
                            eJoinService.upByIccid("0","0",-1,cards.get(i).getIccid());
                        }
                        OPMethod(cards.get(i).getPort(),cards.get(i).getIp(),userName,password,"unlock");
                    } else {
                        System.out.println("CCHO error");

                    }

                }
            }else{
                System.out.println("can not get ip");
                return "æªè·åå°ip";
                }
            }
        }else{
            System.out.println("lack of cards");
            return "å¯ç¨å¡ä¸è¶?;
        }
        return "switch success";
    }

    //åå¡
//    @RequestMapping("/ejoin/forceChange")
//    @ResponseBody
//    public String forceChange(@RequestParam("cust_id")String cust_id) throws InterruptedException {
//        long st=System.currentTimeMillis();
//        //è·åææå½åçæå¡
//        List<TbSChangeiccid> cards=eJoinService.queryAll(1,cust_id);
//        String cluster="";
//        String[] datas=new String[4];
//        boolean flag=false;
//        String userName="";
//        String password="";
//        //è·åç­éå¨å¤å?
//        List<TbSChangeiccid> newcards = eJoinService.getDetail(cust_id, 0, cards.size());
//        if(cards!=null&&cards.size()!=0&&cards.size()==newcards.size()){
//            for(int i=0;i<cards.size();i++){
//                TbPIpMap tbPIpMap =eJoinService.public_Map(cards.get(i).getIp());
//                if(tbPIpMap!=null&&cards.size()!=0){
//                    userName=tbPIpMap.getUserName();
//                    password=tbPIpMap.getPassword();
//                    if(cards.get(i).getPort()!=null&&cards.get(i).getPort().length()!=0) {
//
//                        CCHCMethod(cards.get(i).getPort(),"1",cards.get(i).getIp(),userName,password);
//                        CCHCMethod(cards.get(i).getPort(),"2",cards.get(i).getIp(),userName,password);
//                        CCHCMethod(cards.get(i).getPort(),"3",cards.get(i).getIp(),userName,password);
//                        cluster = CCHOMethod(cards.get(i).getPort(), cards.get(i).getIp(),userName,password);
//                        if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {
//                            if(!CGLAMethod(cards.get(i).getPort(), cluster, newcards.get(i).getTbSPhone().getChangedata(), cards.get(i).getIp(),userName,password)) {
//                                eJoinService.upByIccid(cards.get(i).getIp(),cards.get(i).getPort(),3,newcards.get(i).getIccid());
//                                System.out.println("switch error");
//                                return "åå¡å¼å¸¸";
//                            }
//                            CCHCMethod(cards.get(i).getPort(), cluster, cards.get(i).getIp(),userName,password);
//                            eJoinService.upByIccid(cards.get(i).getIp(),cards.get(i).getPort(),1,newcards.get(i).getIccid());
//                            eJoinService.upByIccid(cards.get(i).getIp(),cards.get(i).getPort(),0,cards.get(i).getIccid());
//                        } else {
//                            System.out.println("CCHO error");
//
//                        }
//
//                    }else{
//                        System.out.println("port info error");
//                        return "ç«¯å£ä¿¡æ¯å¼å¸¸";
//                    }
//                }else{
//                    System.out.println("can not get ip");
//                    return "æªè·åå°ip";
//                }
//            }
//        }else{
//            System.out.println("lack of cards");
//            return "å¯ç¨å¡ä¸è¶?;
//        }
//        System.out.println("end in---------------"+(System.currentTimeMillis()-st));
//        return "switch success";
//    }

    //åå¡
//    @RequestMapping("/ejoin/forceChange")
//    @ResponseBody
//    public String forceChange(@RequestParam("cust_id")String cust_id) throws InterruptedException {
//        long st=System.currentTimeMillis();
//        //è·åææå½åçæå¡
//        List<TbSChangeiccid> cards=eJoinService.queryAll(1,cust_id);
//        String cluster="";
//        String[] datas=new String[4];
//        boolean flag=false;
//        String userName="";
//        String password="";
//        //è·åç­éå¨å¤å?
//        List<TbSChangeiccid> newcards = eJoinService.getDetail(cust_id, -1, cards.size());
//        if(cards!=null&&cards.size()!=0&&cards.size()==newcards.size()){
//            for(int i=0;i<cards.size();i++){
//                TbPIpMap tbPIpMap =eJoinService.public_Map(cards.get(i).getIp());
//                if(tbPIpMap!=null&&cards.size()!=0){
//                    userName=tbPIpMap.getUserName();
//                    password=tbPIpMap.getPassword();
//                    if(cards.get(i).getPort()!=null&&cards.get(i).getPort().length()!=0) {
//
//                        CCHCMethod(cards.get(i).getPort(),"1",cards.get(i).getIp(),userName,password);
//                        CCHCMethod(cards.get(i).getPort(),"2",cards.get(i).getIp(),userName,password);
//                        CCHCMethod(cards.get(i).getPort(),"3",cards.get(i).getIp(),userName,password);
//                        cluster = CCHOMethod(cards.get(i).getPort(), cards.get(i).getIp(),userName,password);
//                        if (cluster.equals("1") || cluster.equals("2") || cluster.equals("3")) {
//                            datas[0] = newcards.get(i).getTbSPhone().getData1();
//                            datas[1] = newcards.get(i).getTbSPhone().getData2();
//                            datas[2] = newcards.get(i).getTbSPhone().getData3();
//                            datas[3] = newcards.get(i).getTbSPhone().getData4();
//                            for (int j = 0; j < 4; j++) {
//                                flag = CGLAMethod(cards.get(i).getPort(), cluster, datas[j], cards.get(i).getIp(),userName,password);
//                                if (!flag) {
//                                    eJoinService.upByIccid(cards.get(i).getIp(),cards.get(i).getPort(),3,newcards.get(i).getIccid());
//                                    System.out.println("data"+j+"write error");
//                                    return "åå¡å¼å¸¸";
//                                }
//                            }
//                            CCHCMethod(cards.get(i).getPort(), cluster, cards.get(i).getIp(),userName,password);
//                            eJoinService.upByIccid(cards.get(i).getIp(),cards.get(i).getPort(),0,newcards.get(i).getIccid());
//                        } else {
//                            System.out.println("CCHO error");
//
//                        }
//
//                    }else{
//                        System.out.println("port info error");
//                        return "ç«¯å£ä¿¡æ¯å¼å¸¸";
//                    }
//                }else{
//                    System.out.println("can not get ip");
//                    return "æªè·åå°ip";
//                }
//            }
//        }else{
//            System.out.println("lack of cards");
//            return "å¯ç¨å¡ä¸è¶?;
//        }
//        System.out.println("ç¨æ¶------------------"+(System.currentTimeMillis()-st));
//        return "switch success";
//    }

    private static String CCHOMethod(String port,String ip,String userName,String password) {

        String url = "http://"+ip+"/goip_send_at.html?username="+userName+"&password="+password+"&port=" + port + "&AT=AT%2bCCHO=%22A0000000871002FF86FF0389938F4FE1%22";
        HttpClient4 client4 = new HttpClient4();
        String result = client4.doGet(url);
        JSONObject object = JSON.parseObject(result);
        try {
            String str = object.get("resp").toString();
            int index = str.indexOf("CCHO:");
            return str.substring(index + 6, index + 7);
        }catch (NullPointerException e){
            e.printStackTrace();
            return "";
        }

    }

    // 51å?52å?53å?
    private static boolean CGLAMethod(String port, String cluster,String data,String ip,String userName,String password) {
        if(data!=null) {
            String url = "http://" + ip + "/goip_send_at.html?username="+userName+"&password="+password+"&port=" + port + "&AT=AT%2bCGLA=" +
                    "" + cluster + "," + data.length() + ",%220" + cluster + data.substring(2, data.length()) + "%22";
            HttpClient4 client4 = new HttpClient4();
            String result = client4.doGet(url);
            JSONObject object = JSON.parseObject(result);
            try {
                String str = object.get("resp").toString();
                return str.contains("\"9000\"");
            }catch (NullPointerException e){
                e.printStackTrace();
                return false;
            }

        }else{
            System.out.println("lack of datas");
            return false;
        }
    }

    private static String CGLAMethod(String port, String cluster,String ip,String userName,String password) {

        String url = "http://"+ip+"/goip_send_at.html?username="+userName+"&password="+password+"&port=" + port + "&AT=AT%2bCGLA=" +
                "" + cluster + ",10,%220" + cluster + "54000000%22";
        HttpClient4 client4 = new HttpClient4();
        String result = client4.doGet(url);
        JSONObject object = JSON.parseObject(result);
        String str = object.get("resp").toString();

        return str;
    }

    private static boolean CCHCMethod(String port, String cluster,String ip,String userName,String password) {

        String url = "http://"+ip+"/goip_send_at.html?username="+userName+"&password="+password+"&port=" + port + "&AT=AT%2bCCHC=" + cluster;
        HttpClient4 client4 = new HttpClient4();
        String result = client4.doGet(url);
        JSONObject object = JSON.parseObject(result);
        try {
            String str = object.toString();
            return !str.contains("ERROR");

        }catch (NullPointerException e){
            e.printStackTrace();
            return false;
        }
    }

    private static boolean OPMethod(String port, String ip,String userName,String password,String op){
        String url = "http://"+ip+"/goip_send_cmd.html?username="+userName+"&password="+password+"&port=" + port + "&op=" + op;
        HttpClient4 client4 = new HttpClient4();
        String result = client4.doGet(url);
        JSONObject object = JSON.parseObject(result);
        try {
            String str=object.get("reason").toString();
            return str.contains("OK");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
