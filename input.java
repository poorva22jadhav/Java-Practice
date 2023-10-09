import java.io.*;


class program12{
            public static void main(String args[]) throws IOException{
                     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                     
                      System.out.println("Who is your current Favourite songwriter? ");
                          String songwriter=br.readLine();
                                     

                      System.out.println("Enter first word of her name?");
                            
                            char ch=(char)br.read();

                   
                              

                      System.out.println("Whats her favourite no?");
                           int Number=Integer.parseInt(br.readLine());


                     




                           System.out.println("SongWriter "+songwriter);
                             System.out.println("FavNo "+Number);
                            System.out.println("FavChar "+ch);

                 }
                      } 