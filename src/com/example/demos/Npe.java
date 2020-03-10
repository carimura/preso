package com.example.demos;

public class Npe {
  public static void main(String[] args) {
    System.out.println(new FindLocation().getCountry().getRegion().getProvince().getCity().getDistrict().getStreet().getAddress().getApartment().toString());
  }
}

final class FindLocation {
  Country getCountry() {
    return new Country();
  }

  static class Country {
    Region getRegion() {
      return new Region();
    }
  }

  static class Region {
    Province getProvince() {
      return new Province();
    }
  }

  static class Province {
    City getCity() {
      return new City();
    }
  }

  static class City {
    District getDistrict() {
      return new District();
    }
  }

  static class District {
    Street getStreet() {
      return new Street();
    }
  }

  static class Street {
    Address getAddress() {
      return new Address();
    }
  }

  static class Address {
    Apartment getApartment() {
      return null;
    }
  }

  static class Apartment {
  }
}