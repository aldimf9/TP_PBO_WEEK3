public class Song {

        private String title,artist[];
        private int duration;


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String[] getArtist() {
            return artist;
        }

        public void setArtist(String[] artist) {
            this.artist = artist;
        }

        public String getDuration() {
            int menit = duration / 60;
            int detik = duration % 60;
            return (menit+":"+detik);
        }

        public void setDuration(int duration) {
            
            this.duration = duration;
        }
    }
