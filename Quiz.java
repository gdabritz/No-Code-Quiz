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
        appyPie.description = "The ideal developer of Appypie is a person with almost no coding experience and has plans to create a simple and small-scale website. Appypie requires no previous coding experience thus the learning curve is very low. The large appeal of this website is its low time to create as well as how low of a risk it is to use it. In comparison to the  other websites in this category it has the quickest time to create, this is due to the limitation in user input thus narrowing the options however at the same time making it more streamline. By having fewer options it allows for less user mistakes thus the risk to use the website is lowered. Likewise all the data is stored on an external cloud, therefore no user data could ever be lost on their end. Another benefit is the direct publishing of the website, the developer does not have to wonder how to release it when it's handled already. Lastly the help resources available are found as classes and chat bots that can aid you for any potential problems found. While there are several benefits to using Appypie there are also downsides to it. The first is the cost, while it is not the most expensive website found in the No coding genre it is still a substantial amount of money when compared to free resources such as VSCode. The low time to create comes at this cost just like the level of customization available, drag and drop creation is useful to keep up with a time limitation however it drastically lowers just how much the user can create the website to their liking. Thus developers who have the budget but no time to create a website should go towards Appypie as their website development platform. ";
        appyPie.pros = "Pros: Time to Create, No Coding Knowledge Required";            
        appyPie.cons = "Cons: Higher Cost, Lower Customization";


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
        shoutemGB.description = "While these platforms are considered “low-code”, there is no coding requirement, so it is friendly for all users. There is an option for an HTML plugin, so if one has some coding experience, the option is there for further customization. Both platforms offer contact lines with highly rated customer service teams to walk you through building the app. With both platforms, infrastructure for the app is already in place, which means you don't need to be an IT wiz to run your app. This infrastructure also allows your application to be created fairly quickly and easily, though for someone less tech-savvy things could move a bit slower. Overall, application development shouldn't take more than a few days, if that, and all content created on the platform belongs to the user. Some downsides of these platforms are the cost. You are due to spend at least $100 monthly on these apps, and likely will spend more on customizations/ maintenance. The application formats are there for you to drag and drop, and while there seems to be unlimited features to play with, there is going to be a limit to how precise you can come to creating your specific vision. If you have the budget, Shoutem will create your app for you, offering more customization options, but this will cost upwards of $1500. There are limitations on the final application as well- Shoutem only creates mobile apps (not web apps) and is only available in english. If you're looking to create an app and let it ride long term, you may want to consider Goodbarber over Shoutem, as future data migration could prove difficult and annoying. Overall, if you're a small market company looking for a simple, set-and-forget, low-function website with a large budget, this is the level of code for you.";
        shoutemGB.pros = "Pros: No Coding Knowledge Required, Low Time to Create";
        shoutemGB.cons = "Cons: Higher Cost, Lower Customization, Limitations on Final Product";




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
        bubble.description = "Bubble's ideal developer aims to create a large-scale app targeting a wide user base on both Android and iOS platforms. Bubble offers several advanced features options without the requisite of coding expertise, although having some would allow some additional functionality to be used. As one of the more premium platforms, Bubble expedites the process of publishing a developer's app and allows an easy method to continually update and manage the app's progress over time. Additionally, Bubble guarantees protection for all data hosted on its servers, and allows developers to easily import/export data for migration purposes. These characteristics, along with the higher cost, make Bubble ideally suited for industry-level app development: apps with millions of regular users, apps needing regular updates, apps with a more professional aesthetic, etc. The expense of Bubble's feature set is mitigated by the fact that most of its clientele consists of larger companies, not individuals or small teams looking to make a start-up application. In fact, most individuals or smaller teams could be overwhelmed by the plethora of options Bubble offers, and may be better suited with a simpler platform like Appypie. Bubble presents an accessible, high performance development platform with the potential for higher customization if the proper expertise and money is available.";
        bubble.pros = "Pros: High Rate App Scale, Very Little Limitations, Advanced App Features/Functionality";
        bubble.cons = "Cons: Not Beginner Friendly, High Cost, Overwhelming Options";



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
        vsCode.description = "VSCode's ideal developer has years of software development experience and aims to complete a highly detailed, large-scale project over a longer period of time. While VSCode offers a higher degree of customization to its users, it provides little assistance in the development or publication processes of building an application. This high barrier to entry is compensated by several benefits when compared to other platforms: VSCode is free to use, allows full control over one's data, and since code is traditionally saved on GitHub it is easier to see the history of one's work and revert to a previous version if necessary. This control is a common theme for VSCode: The downsides come in the form of increased time to create an app (compared to drag & drop platforms like Appypie) and the lack of support from VSCode itself; no customer service, publishing support, or data hosting will be provided. If a problem arises and the developer is stuck, VSCode will not offer any consulting services to assist; it's an IDE, not a company designed to help developers publish apps. Therefore, skilled developers with the time to prioritize the customization and cost of their app will find the most success with VSCode.";
        vsCode.pros = "Pros: Low Cost, High Customization";
        vsCode.cons = "Cons: High Coding Experience Required, High Time to Create, No Publishing Support";
        

        
        // Part 1 of Quiz

        Scanner scan1 = new Scanner(System.in);
        int counter = 1;
        appyPie.votes = 0;
        shoutemGB.votes = 0;
        bubble.votes = 0;
        vsCode.votes = 0;

        String[] questions = {"Have you ever created a project using code and are confident in your programming skills?", "Are you willing to let the platform build the app for you? (This would restrict the degree to which you can customize, but be easier and simpler to build).", "Are you willing to spend over $100 per month?", "Do you require developer/tech support?",
        "Do you intend for your project to handle high traffic (Over 250,000 page views per month)?", "Do you plan on adding new features to your app after publication? (Examples include software/ menu updates, order notifications, or social media stories).", "Does your app contain large-scale features? (Examples include search algorithms, large number of files/ large file types, etc.).", "Do you need your app to be in any language other than english?"};

        for (int i = 0; i < questions.length; i++){

            // Output question
            System.out.println();
            System.out.println(counter + ") " + questions[i] + " Type 'yes' or 'no'.");

            // Input Y or N
            String x = scan1.next();

            if(!(x.equals("yes") || x.equals("no"))){
                System.out.println();
                System.out.println("Please respond with either 'yes' or 'no', all lowercase letters. Try again!");
                System.out.println();
                i--;
                continue;
            }
                
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

        System.out.println();
        System.out.println();
        System.out.println();





        // Part 2 of Quiz

        Scanner scan2 = new Scanner(System.in);
        
        System.out.println("For the categories below:");
        System.out.println("1. CUSTOMIZATION - how precisely the programmer can depict their vision of the final product on the platform itself.");
        System.out.println("2. BUILD TIME - The amount of time it takes for the programmer to complete the product from start to finish using this platform. Build Time does not reflect how long a new programmer takes to learn how to use the platform.");
        System.out.println("3. COST - how much does the platform cost to use (in dollars).");
        System.out.println("4. USER FRIENDLINESS - how easy the platform is for the programmer to use or how likely it is that the programmer runs into a problem.");
        System.out.println("5. DEVELOPER RISK - the likelihood of the developer to make an error while coding/constructing the application.");
        System.out.println("6. APP SCALE - the desired size of your application, the desire to consistently update the application over time, and a mix of the number of features and expected traffic on your application.");
        System.out.println();
        System.out.println();
        System.out.println();


        int[] userPriorities = new int[4];

        System.out.print("Each category has a number cooresponding to it (ex. '1' cooresponds to Customization). For the questions below, select the number associated with the category you want to answer with. Please select each category only once.");

        System.out.println();
        System.out.println();

        System.out.println("Select the NUMBER associated with the category that is your HIGHEST priority for your platform: ");
        userPriorities[0] = scan2.nextInt();

        System.out.println("Select the NUMBER associated with the category that is your SECOND HIGHEST priority for your platform: ");
        userPriorities[1] = scan2.nextInt();

        System.out.println("Select the NUMBER associated with the category that is your LOWEST priority for your platform: ");
        userPriorities[2] = scan2.nextInt();

        System.out.println("Select the NUMBER associated with the category that is your SECOND LOWEST priority for your platform: ");
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


        int[] totalMatches = {appyPie.matches, shoutemGB.matches, bubble.matches, vsCode.matches};
        Arrays.sort(totalMatches);

        for(int i=0; i < results.size(); i++){

            if(results.get(i).matches == totalMatches[3]){
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println(results.get(i).name + " is your ideal choice!");
                System.out.println();
                System.out.println();
                System.out.println(results.get(i).pros);
                System.out.println(results.get(i).cons);
                System.out.println();
                System.out.println();
                System.out.println(results.get(i).description);
                System.out.println();
                System.out.println();


                break;
            }


        }



        scan1.close();
        scan2.close();
            
    }





}




