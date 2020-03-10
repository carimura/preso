package com.example.demos;

import java.time.LocalDate;

public class Instanceof {

  public static void main(String[] args) throws Exception {
    Object t = LocalDate.now();

    if (t instanceof LocalDate) {
      LocalDate today = (LocalDate) t;
      showImage("Two days ago was ", today.minusDays(2));
    }

    if (t instanceof LocalDate day) {
      showImage("Yesterday was ", day.minusDays(1));
      showImage("Today is ", day);
    }
  }


  private static void showImage(String welcome, LocalDate day) {
    System.out.println("\n\n" + welcome + day.getDayOfWeek().toString());
    var mood = switch (day.getDayOfWeek()) {
      case MONDAY -> "https://3.bp.blogspot.com/-MhtB2_N6aeA/TkluAPDNcNI/AAAAAAAAAd0/R_CJKns_hMc/s1600/A+case+of+the+mondays.jpg";
      case TUESDAY, WEDNESDAY, THURSDAY -> "https://media.giphy.com/media/W29Ww6PVetRDyGxMkC/giphy.gif";
      case FRIDAY -> "https://media.giphy.com/media/fw2caEoXBisMJwksAu/giphy-downsized.gif";
      case SATURDAY, SUNDAY -> "https://media.giphy.com/media/PjaQaNkMyHquc/giphy-downsized.gif";
    };

    try {
      ProcessBuilder pb = new ProcessBuilder("img", mood);
      pb.inheritIO();
      Process s = pb.start();
      s.waitFor();
    } catch (Exception e) {
      // e
    }
  }

}