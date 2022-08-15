import java.util.*;


public class Quiz {
    
    public static void main(String[] args){

        Platform appyPie = new Platform();
        Platform shoutemGB = new Platform();
        Platform bubble = new Platform();
        Platform vsCode = new Platform();
        Platform user = new Platform();


        // Appypie data
        appyPie.name = "Appypie";
        appyPie.votes = 0;
        appyPie.customization = false;
        appyPie.buildTime = true;
        appyPie.cost = true;
        appyPie.userFriendly = true;
        appyPie.risk = true;
        appyPie.appScale = false;
        appyPie.matches = 0;
    


        // Shoutem/Goodbarber data
        shoutemGB.name = "Shoutem/Goodbarber";
        shoutemGB.votes = 0;
        shoutemGB.customization = false;
        shoutemGB.buildTime = true;
        shoutemGB.cost = false;
        shoutemGB.userFriendly = true;
        shoutemGB.risk = true;
        shoutemGB.appScale = false;
        shoutemGB.matches = 0;
   



        // Bubble data
        bubble.name = "Bubble";
        bubble.votes = 0;
        bubble.customization = true;
        bubble.buildTime = false;
        bubble.cost = false;
        bubble.userFriendly = false;
        bubble.risk = false;
        bubble.appScale = true;
        bubble.matches = 0;



        // VSCode data
        vsCode.name = "VSCode";
        vsCode.votes = 0;
        vsCode.customization = true;
        vsCode.buildTime =false;
        vsCode.cost = true;
        vsCode.userFriendly = false;
        vsCode.risk = false;
        vsCode.appScale = true;
        vsCode.matches = 0;

        

        
        // Part 1 of Quiz

        Scanner scan1 = new Scanner(System.in);
        int counter = 1;
        appyPie.votes = 0;
        shoutemGB.votes = 0;
        bubble.votes = 0;
        vsCode.votes = 0;

        String[] questions = {"Have you ever created a project using code?", "Are you willing to let the platform build the app for you?", "Are you willing to spend over $100 per month?", "Do you require developer/tech support?",
        "Do you intend for your project to handle high traffic?", "Do you plan on adding new features to your app after publication?", "Does your app contain large-scale features?", "Do you need your app to be in any language other than english?"};

        for (int i = 0; i < questions.length; i++){

            // Output question
            System.out.println(counter + ") " + questions[i] + " Type 'yes' or 'no'.");

            // Input Y or N
            String x = scan1.next();

            /*if (x.equals("yes") || x.equals("no")){*/
                
                // Switch statement to add or subtract from platforms
                if (x.equals("yes")){

                    switch (counter) {
                        case 1: break;
                        case 2: break;
                        case 3: break;
                        case 4: vsCode.votes--;
                                break;
                        case 5: appyPie.votes--;
                                break;
                        case 6: appyPie.votes--;
                                break;
                        case 7: appyPie.votes--;
                                shoutemGB.votes--;
                                break;
                        case 8: shoutemGB.votes--;
                                break;
                    }


                }else if(x.equals("no")){

                    switch (counter) {
                        case 1: vsCode.votes = vsCode.votes - 5;
                                break;
                        case 2: appyPie.votes--;
                                break;
                        case 3: bubble.votes--;
                                shoutemGB.votes--;
                                break;
                        case 4: break;
                        case 5: break;
                        case 6: break;
                        case 7: break;
                        case 8: break;
                    }
                }

            //}
            
            /*if(!(x.equals("yes") || x.equals("no"))){
                System.out.println(" Please respond with either 'yes' or 'no', all lowercase letters. Try again!");
            }*/


            counter++;

        }



        ArrayList<Platform> results = new ArrayList<Platform>(Arrays.asList(appyPie, shoutemGB, bubble, vsCode));

        int[] totalVotes = {appyPie.votes, shoutemGB.votes, bubble.votes, vsCode.votes};
        Arrays.sort(totalVotes);

        for(int i=0; i < results.size(); i++){

            if(results.get(i).votes == totalVotes[0]){
                results.remove(i);
                break;
            }

        }

        
        /*for(int i=0; i < results.size(); i++){
            
            System.out.println(results.get(i).name);

        }*/
        


        System.out.println();

        /*System.out.println("Appypie = " + appyPie.votes);
        System.out.println("Shoutem/ Goodbarber = " + shoutemGB.votes);
        System.out.println("Bubble = " + bubble.votes);
        System.out.println("VScode = " + vsCode.votes);*/





        // Part 2 of Quiz

        Scanner scan2 = new Scanner(System.in);
        //String[] categories = {"High Customization", "Low Build Time", "Low Cost", "High User Friendliness", "Low Developer Risk", "High Rate App Scale"};

        System.out.println("For the categories listed below:");
        System.out.println("1. High Customization");
        System.out.println("2. Low Build Time");
        System.out.println("3. Low Cost");
        System.out.println("4. High User Friendliness");
        System.out.println("5. Low Developer Risk");
        System.out.println("6. High Rate App Scale");
        System.out.println();
        System.out.println();
        System.out.println();


        int[] userPriorities = new int[4];

        System.out.println("List the number associated with your HIGHEST priority for your platform: ");
        userPriorities[0] = scan2.nextInt();

        System.out.println("List the number associated with your SECOND HIGHEST priority for your platform: ");
        userPriorities[1] = scan2.nextInt();

        System.out.println("List the number associated with your LOWEST priority for your platform: ");
        userPriorities[2] = scan2.nextInt();

        System.out.println("List the number associated with your SECOND LOWEST priority for your platform: ");
        userPriorities[3] = scan2.nextInt();


        for (int i=0; i < 2; i++){
            
            switch (userPriorities[i]) {
                case 1: user.customization = true;
                        break;
                case 2: user.buildTime = true;
                        break;
                case 3: user.cost = true;
                        break;
                case 4: user.userFriendly = true;
                        break;
                case 5: user.risk = true;
                        break;
                case 6: user.appScale = true;
                        break;
            }
        }

        for (int i=2; i < 4; i++){
            
            switch (userPriorities[i]) {
                case 1: user.customization = false;
                        break;
                case 2: user.buildTime = false;
                        break;
                case 3: user.cost = false;
                        break;
                case 4: user.userFriendly = false;
                        break;
                case 5: user.risk = false;
                        break;
                case 6: user.appScale = false;
                        break;
            }
        }



        for(int i = 0; i < results.size(); i++){

            if(user.customization == results.get(i).customization){
                results.get(i).matches++;
            }
            if(user.buildTime == results.get(i).buildTime){
                results.get(i).matches++;
            }
            if(user.cost == results.get(i).cost){
                results.get(i).matches++;
            }
            if(user.appScale == results.get(i).appScale){
                results.get(i).matches++;
            }
            if(user.userFriendly == results.get(i).userFriendly){
                results.get(i).matches++;
            }
            if(user.risk == results.get(i).risk){
                results.get(i).matches++;
            }

            
        }


        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i).name + " has " + results.get(i).matches + " match votes.");
        }





        scan1.close();
        scan2.close();
            
    }





}




