package com.company.practice.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**PredicateDemo Example to Remove null values and Empty String from the given List */
public class PredicateToRemoveNullValuesAndEmptyStringFromTheGivenList {
    public static void main(String[] args) {

        Predicate<String> stringPredicate=(givenString)-> givenString != null && givenString.length() !=0;

        List<String> names= new ArrayList<>();
        List<String> filteredNames= new ArrayList<>();
        names.add("");
        names.add("Hari");
        names.add("Sita");
        names.add(null);
        names.add("Kumari");

        System.out.println("_____________BEFORE REMOVING EMPTY AND NULL VALUES____________");
        names.forEach(System.out::println);

      names.forEach(name->{
          if(stringPredicate.test(name)){
              filteredNames.add(name);
          }
      });

        System.out.println("_____________ AFTER REMOVING EMPTY AND NULL VALUES ____________");
        filteredNames.forEach(System.out::println);


    }
}
