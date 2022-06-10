package com.collection;

import java.util.EnumSet;

public class EnumSETEXAM {
    
    enum days
    {
        Monday,Tuesday,wednesday,Thrusday,Friday,Saturday,Sunday
    }

    public static void main(String[] args) {
        
        EnumSet<days> em = EnumSet.range(days.Friday,days.Sunday);
       
        EnumSet<days> em1 = EnumSet.allOf(days.class);
        System.out.println("EnumSet: " + em);
        System.out.println("EnumSet: " + em1);

}
}
