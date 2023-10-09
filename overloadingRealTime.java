class IPL{
      void MatchInfo(String team1,String team2){
           System.out.println("Team VS Team: "+team1 +" VS "+team2);
           }

       void MatchInfo(String team1,String team2,String venue){
            System.out.println("Team VS Team: "+team1 +" VS "+team2);
            System.out.println("Venue: "+venue);

            }



                   }

class client{
      public static void main(String args[]){
            IPL ipl2023=new IPL();
            ipl2023.MatchInfo("India","Australia","Perth");
            ipl2023.MatchInfo("India","Australia");

                                                    }
                                                         }
               