package com.wechatify.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessageDetails
{

   @SerializedName("msgName")
   @Expose
   private String msgName;

   @SerializedName("msgDetails")
   @Expose
   private String msgDetails;

   @SerializedName("ScheduleTime")
   @Expose
   private String scheduleTime;
   @SerializedName("RemarkCountOne")
   @Expose
   private String remarkCountOne;
   @SerializedName("RemarkCountTwo")
   @Expose
   private String remarkCountTwo;

   public String getMsgName()
   {
      return msgName;
   }

   public void setMsgName(String msgName)
   {
      this.msgName = msgName;
   }

   public String getScheduleTime()
   {
      return scheduleTime;
   }

   public void setScheduleTime(String scheduleTime)
   {
      this.scheduleTime = scheduleTime;
   }

   public String getRemarkCountOne()
   {
      return remarkCountOne;
   }

   public void setRemarkCountOne(String remarkCountOne)
   {
      this.remarkCountOne = remarkCountOne;
   }

   public String getRemarkCountTwo()
   {
      return remarkCountTwo;
   }

   public void setRemarkCountTwo(String remarkCountTwo)
   {
      this.remarkCountTwo = remarkCountTwo;
   }

   public String getMsgDetails()
   {
      return msgDetails;
   }

   public void setMsgDetails(String msgDetails)
   {
      this.msgDetails = msgDetails;
   }
}
