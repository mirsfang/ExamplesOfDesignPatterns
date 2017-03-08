package create.prototype.prototypeAbs;/**
 * Created by MirsFang on 2017/3/8.
 */


import java.util.ArrayList;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/03/08/下午12:32  
 *备注      
 ***/

public abstract class BaseMessage {
    //发件人
    private String send;
    //收件人
    private String receiver;
    //消息
    private String message;

    private ArrayList<String> imgList=new ArrayList<>();

    public ArrayList<String> getImgList() {
        return imgList;
    }

    public void setImgList(ArrayList<String> imgList) {
        this.imgList = imgList;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addImage(String image){
        getImgList().add(image);
    }

    /**
    *发送消息
    *作者:Mirsfang
    *日期:2017/3/8/下午12:33
    *描述:
    **/
    public void sendMessage(){
        System.out.println(getReceiver()+getMessage()+"     充气娃娃图片数量"+getImgList().size()+"     发件人"+getSend());
    }
}
