import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
         System.out.println("BlackPanther");
        System.out.println("Opps");
        System.out.println("Seasons");
        System.out.println("TheWays");
        System.out.println("X");
        System.out.println("KendrickLamar");
        System.out.println("Khalid");
        System.out.println("Mozzy");
        System.out.println("SchoolboyQ");
        System.out.println("VinceStaples");
        System.out.println("130");
        System.out.println("180");
        System.out.println("238");
        System.out.println("242");
        System.out.println("267");
        Recording[] recordingsArray = new Recording[5];
        int a, b;
        Recording temp;
        final int MAXSIZE = recordingsArray.length - 1;
        int iterations = MAXSIZE;
        Scanner input = new Scanner(System.in);
        String entered;
        for(a = 0;a < recordingsArray.length;++a){
            if(recordingsArray[a] == null){
                recordingsArray[a] = new Recording();
                System.out.println("Please enter the title:");
                recordingsArray[a].setSong(input.nextLine());
                System.out.println("Now, please enter the artist:");
                recordingsArray[a].setArtist(input.nextLine());
                System.out.println("Now, please enter the play time in seconds");
                recordingsArray[a].setPlayTime(input.nextInt());
                input.nextLine();
            }
        }
        display(recordingsArray, 0);
        System.out.println("Please enter which category you want to sort the array by:");
        entered = input.nextLine();
        switch(entered.toUpperCase()){
            case "TITLE":
                for(a = 0;a < MAXSIZE;++a){
                    for(b = 0;b < iterations;++b){
                        if(recordingsArray[b].getSong().compareTo(recordingsArray[b+1].getSong()) > 0){
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b+1];
                            recordingsArray[b+1] = temp;
                        }
                    }
                    display(recordingsArray, (a+1));
                    --iterations;
                }
                break;
            case "ARTIST":
                for(a = 0;a < MAXSIZE;++a){
                    for(b = 0;b < iterations;++b){
                        if(recordingsArray[b].getArtist().compareTo(recordingsArray[b+1].getArtist()) > 0){
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b+1];
                            recordingsArray[b+1] = temp;
                        }
                    }
                    display(recordingsArray, (a+1));
                    --iterations;
                }
                break;
            case "PLAYTIME":
                for(a = 0;a < MAXSIZE;++a){
                    for(b = 0;b < iterations;++b){
                        if(recordingsArray[b].getPlayTime() > recordingsArray[b+1].getPlayTime()){
                            temp = recordingsArray[b];
                            recordingsArray[b] = recordingsArray[b+1];
                            recordingsArray[b+1] = temp;
                        }
                    }
                    display(recordingsArray, (a+1));
                    --iterations;
                }
                break;
        }
    }
    public static void display(Recording[] recordingsArray, int iterations){
        for(int x = 0;x < recordingsArray.length;++x)
            System.out.println("Title: "+recordingsArray[x].getSong()+" "+
                    "Artist: "+recordingsArray[x].getArtist()+" "+
                    "Playtime: "+recordingsArray[x].getPlayTime());
       
    }
}
