import java.util.Scanner;

public class Condo {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int floor, room;


        do

    {


        System.out.println("---------------- Setup Condo-------------------------");
        System.out.print("Number floor Condo: ");

        floor = sc.nextInt();
        if (floor <= 0) {
            System.out.println("floor can not be positive or zero");
        }

        System.out.print("Number room Condo: ");
        room = sc.nextInt();
        if (room <= 0) {
            System.out.println("room can not be positive or zero");
        }


    } while(!(floor >0&&room >0));
        System.out.println("Total Condo has : "+(floor *room));
    int option;

    String[][] condo = new String[floor][room];




        do

    {
        System.out.println("=============WELCOME TO CONDO MANAGEMENT====================");

        System.out.println("1.Buy condo");
        System.out.println("2.Sell condo");
        System.out.println("3.Search Informatio");
        System.out.println("4.Display Informantion");
        System.out.println("5.Exit");
        System.out.println("5.-------------------------");
        System.out.print("Please your option: ");
        option = sc.nextInt();
        // int col=0;
        switch (option) {
            case 1: {

                do {


                    System.out.println("------------------Buy Condo---------------");

                    System.out.println("Enter your desired floor " + "1" + "-" + floor);
                    int desir_floor = sc.nextInt();

                    if (desir_floor > 0 && desir_floor <= floor) {
                        System.out.println("Enter your desired room " + "1" + "-" + room);
                        int desir_room = sc.nextInt();
                        if (desir_room > 0 && desir_room <= room) {
                            if (condo[desir_floor - 1][desir_room - 1] != null) {
                                System.out.println("Already have owner");
                            } else {
                                System.out.print("Enter your name : ");
                                String name = sc.next();
                                condo[desir_floor - 1][desir_room - 1] = name;
                                break;
                            }
                        } else {
                            System.out.println(" room can only selected from 1 to " + room);
                        }
                    } else {
                        System.out.println(" Floor can only selected from 1 to " + floor);
                    }

//                        System.out.println("Enter your desired room " + "1" + "-" + room);
//                        int desir_room = sc.nextInt();
//
//                        System.out.print("Enter your name : ");
//                        String name = sc.next();
//                        condo[desir_floor - 1][desir_room - 1] = name;

                } while ((floor > 0 && room > 0));
                break;
            }

            case 2: {


                do {


                    System.out.println("------------------Selling the Co Backs---------------");

                    System.out.println("Enter the  floor for sell");
                    int sellfloor = sc.nextInt();
//                    System.out.println("Enter the room floor for sell");
                    if (sellfloor > 0 && sellfloor <= floor) {
                        System.out.println("Enter the room  for sell");
                        int sellroom = sc.nextInt();
                        if (sellroom > 0 && sellroom <= room) {
                            if (condo[sellfloor - 1][sellroom - 1] != null) {
                                System.out.println("floor : " + floor);
                                System.out.println("room : " + room);

                                System.out.println("Belong to : " + condo[sellfloor - 1][sellroom - 1]);

                                //System.out.println(condo[sellfloor - 1][sellroom - 1]);
                                System.out.println("Enter 1 to confirm and 0 to cancel : ");
                                int number = sc.nextInt();
                                if (number == 1) {
                                    condo[floor - 1][room - 1] = null;

                                    System.out.println("Congratulation u sell successfully");
                                    break;

                                }
                                if (number == 0) {
                                    System.out.println("0 to cancel");
                                    break;
                                }
//

                            } else {
                                System.out.println("canot selll the condo,cause you don't have the ownership");
                            }
                        } else {
                            System.out.print("Room can only be selected from 1 to : " + room);
                        }
                    } else {
                        System.out.println("floor can only be selected from 1 to :  " + room);
                    }


                } while ((floor > 0 && room > 0));
                break;
            }
            case 3: {
                System.out.println("--------------Search Information-----------------------------------");
                System.out.println("1. Search by owner' s name : ");
                System.out.println("2.Search by floor : ");
                System.out.println("3. Exit");
                System.out.println("=> Choose your option from ");


                option = sc.nextInt();
                if (option == 1) {

                    System.out.println("Search by owner name: ");
                    String nameforSearch = sc.next();
                    boolean isFound = false;

                    for (int row = 0; row < condo.length; row++) {
                        for (int col = 0; col < condo[row].length; col++) {


                            if (nameforSearch.equals(condo[row][col])) {
                                isFound = true;
                                System.out.println("owner name :" + nameforSearch + " Stary in Room:" + (col + 1) + " floor: " + (row + 1));


                            }


                        }
                    }
                    if (!isFound) {
                        System.out.println("It is not found");
                    }


//                      if (result2[floor-1][room-1].equals(nameforSearch)){
//
//                          System.out.println("helo");
//
//
//
//
//                    }

                }
                if (option == 2) {
                    System.out.print("Enter Floor to search : ");

                    int searchfloor = sc.nextInt();


                    for (int row = 0; row < condo.length; row++) {
                        for (int col = 0; col < condo[row].length; col++) {
                            if ((row + 1) == searchfloor) {
                                System.out.println("floor" + (row + 1) + "=>" + condo[row][col]);
                            }
                        }
                    }

                }
                if (option == 3) {
                    System.out.println("Exit");
                }
                break;


            }
            case 4: {
                System.out.println("------------------Display Condo---------------");


                for (int row = 0; row < condo.length; row++) {
                    System.out.print("floor" + (row + 1));


                    for (int col = 0; col < condo[row].length; col++) {
                        System.out.print(" \t" + condo[row][col]);


                    }
                    System.out.println();


                }


                break;
//
//

            }


        }
    } while(option !=5);
}
}
