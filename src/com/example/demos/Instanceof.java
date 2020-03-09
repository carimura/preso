package com.example.demos;

import java.time.LocalDate;

public class Instanceof {

  public static void main(String[] args) throws Exception {
    Object t = LocalDate.now();

    if (t instanceof LocalDate) {
      LocalDate now = (LocalDate) t;
      System.out.println("Today is " + now.getDayOfWeek().toString());
    }

    if (t instanceof LocalDate l) {
      System.out.println("Sounds like someone had a case of the " + l.minusDays(1).getDayOfWeek().toString() + "s yesterday...");
      var imgurl = "https://3.bp.blogspot.com/-MhtB2_N6aeA/TkluAPDNcNI/AAAAAAAAAd0/R_CJKns_hMc/s1600/A+case+of+the+mondays.jpg";
      try {
        ProcessBuilder pb = new ProcessBuilder("img", imgurl);
        pb.inheritIO();
        Process s = pb.start();
        s.waitFor();
      } catch (Exception e) {
        // e
      }
    }

  }

}