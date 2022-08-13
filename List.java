import java.util.*;



public class List {
    int customization;
    int buildTime;
    int cost;
    int userFriendly;
    int risk;
    int appScale;


    

    public static void main(String[] args) {


        // Part 1 of quiz

        String[] questions = {"Have you ever created a project using code?", "Are you willing to let the platform build the app for you?", "Are you willing to spend over $100 per month?", "Do you require developer/tech support?",
        "Do you intend for your project to handle high traffic?", "Do you plan on adding new features to your app after publication?", "Does your app contain large-scale features?", "Do you need your app to be in any language other than english?"};


        int appypie = 0, shoutemGB = 0, bubble = 0, VScode = 0, j = 1;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++){

            // Output question J
            System.out.println(j + ") " + questions[i] + " Type 'yes' or 'no'.");

            // Input Y or N
            //Scanner scan = new Scanner(System.in);
            String x = scan.next();
            //scan.close();
            //System.out.println(x);

            // Switch statement to add or subtract from platforms
            if (x.equals("yes")){

                switch (j) {
                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4:  VScode--;
                             break;
                    case 5:  appypie--;
                             break;
                    case 6:  appypie--;
                             break;
                    case 7:  appypie--;
                             shoutemGB--;
                             break;
                    case 8:  shoutemGB--;
                             break;
                }


            }else if(x.equals("no")){

                switch (j) {
                    case 1: VScode = VScode - 5;
                            break;
                    case 2: appypie--;
                            break;
                    case 3: bubble--;
                            shoutemGB--;
                            break;
                    case 4:  break;
                    case 5:  break;
                    case 6:  break;
                    case 7:  break;
                    case 8:  break;
                }



            }else{
                System.out.println(" Please respond with either 'yes' or 'no'.");
            }

            /*System.out.println("Appypie = " + appypie);
            System.out.println("Shoutem/ Goodbarber = " + shoutemGB);
            System.out.println("Bubble = " + bubble);
            System.out.println("VScode = " + VScode);*/
            j++;

        }


        
        System.out.println("Appypie = " + appypie);
        System.out.println("Shoutem/ Goodbarber = " + shoutemGB);
        System.out.println("Bubble = " + bubble);
        System.out.println("VScode = " + VScode);
        scan.close();








        // Part 2 of quiz

        // List 6 categories
        String[] categories = {"High Customization", "Low Build Time", "Low Cost", "High User Friendliness", "Low Developer Risk", "High Rate App Scale"};

        // List each category 1 by 1

        // Input choice for each category (+, 0, or -)

        // Match overall choices to pre defined personas


        List appyPie = new List();
        List shoutGB = new List();
        List bub = new List();
        List vs_code = new List();

        appyPie.customization = 5;
        appyPie.buildTime = 5;
        appyPie.cost = 1;
        appyPie.userFriendly = 5;
        appyPie.risk = 1;
        appyPie.appScale = 1;


        

    }





}
