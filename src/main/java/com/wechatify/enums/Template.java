/**
 * 
 */
package com.wechatify.enums;

public class Template
{

   public enum TemplateSub
   {
      CREATE("Create"), SCHEDULE("Schedule"), APPROVE("Approve"), QUEUE("Queue"), LOG("Log"), SMFCLOG("SFMC Log");

      String label;

      private TemplateSub(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      @Override
      public String toString()
      {
         return this.label;
      }

   }

   public enum TemplateTopMenuTabs
   {
      TEMPLATEMESSAGE("Template message"), TEMPLATEMASTER("Template master");

      String label;

      private TemplateTopMenuTabs(String label)
      {
         this.label = label;

      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      @Override
      public String toString()
      {
         return this.label;
      }

   }

   public enum TemplateInnerPageHeaderText
   {
      CREATE("Template message"), SCHEDULE("Schedule message"), APPROVE("Approve message"), QUEUE("Message queue ");

      String label;

      private TemplateInnerPageHeaderText(String label)
      {
         this.label = label;
      }

      public String getLabel()
      {
         return this.label.toUpperCase();
      }

      @Override
      public String toString()
      {
         return this.label;
      }
   }

   /**
    * 
    * @version $Id$
    */

}
