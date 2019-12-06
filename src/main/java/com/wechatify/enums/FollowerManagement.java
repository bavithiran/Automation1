/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.wechatify.enums;

/*
 * Follower management related enums and constants: 
 * @auther Narottam Singh  
 * @created 16-Jul-2019 2019 5:37:55 PM
 */
public class FollowerManagement{
   public enum FollowerManagementTopHeader {
      FOLLOWER_HEADER("WeChat Follower & Group Management");
      String label;

      private FollowerManagementTopHeader(String label) {
         this.label = label;
      }

      public String getLabel(){
         return this.label.toUpperCase();
      }

      @Override
      public String toString() {
         return this.label;
      }
   }

}
