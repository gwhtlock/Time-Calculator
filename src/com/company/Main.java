package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




            System.out.println(addTime());

    }



    public static String addTime(){

        int extraHour = 0;
        int totalHours = 0;
        int totalMinutes = 0;
        int hours;
        int minutes;
        int terminate;
        String finalTime;


        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Do you want to continue?");
            System.out.println("Yes = 1 or No = 0");
            terminate = scanner.nextInt();



            if(terminate == 0){
                break;
            }

            System.out.println("Enter total hours to add:");
            hours = scanner.nextInt();

            System.out.println("Enter total minutes to add:");
            minutes = scanner.nextInt();




            totalHours += hours;

            if((minutes >=60)){
                extraHour = minutes /60;
                totalHours+=extraHour;

                totalMinutes+=(minutes%60);
            }else{

                if(minutes>=0) {
                    totalMinutes += minutes;
                }
            }

            if(totalMinutes >=60){

                extraHour = totalMinutes /60;
                totalHours+=extraHour;


                totalMinutes =(totalMinutes%60);


            }



            if(totalMinutes <10){
                System.out.println(totalHours+":0"+totalMinutes+" = total time left in class");
            }else{
                System.out.println(totalHours+":"+totalMinutes+" = total time left in class");
            }

        }while(true);

        if(totalMinutes <10){
            finalTime = "final total = "+totalHours+":0"+totalMinutes+" = total time left in class";
        }else{
            finalTime = "final total = "+totalHours+":"+totalMinutes+" = total time left in class";
        }

        return finalTime;
    }
}
