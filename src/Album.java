public class Album {

        private Song[] songs;
        private String title;
        private int year;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
        
        public void addSong(Song song){
            if(songs == null){
                songs = new Song[1];
                songs[0] = song;
            } else {
                int i = songs.length;
                Song[] newsing = new Song[i + 1];
                for(int k = 0;k < i;k++){
                    newsing[k] = songs[k];
                }
                newsing[i] = song;
                songs = newsing;
            } 
        }
        
        public void displayInfo(){
            System.out.println("Album Info");
            System.out.println("Title : "+ title);
            System.out.println("Year  : "+ year);
            System.out.println("Song List");
            for(int i = 0 ;i < songs.length;i++){
                System.out.println((i+1) + " Title   : "+ songs[i].getTitle());
                System.out.println("  Artist   : "+String.join(", ", songs[i].getArtist()));
                System.out.println("  Duration : "+ songs[i].getDuration());
            }
        }
    }

