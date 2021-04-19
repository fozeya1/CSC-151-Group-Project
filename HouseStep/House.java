public class House {
        private String style;
        
        private double plot;
        private int bedrooms;
        
        private double familyRoomArea;
        private double livingRoomArea;
        
        
        
        public House() {
        }
        
        public House(String style, double familyRoomArea, double livingRoomArea, int bedrooms, double plot) {
            this.style = style;
            
            this.plot = plot;
            this.bedrooms = bedrooms;
            
            this.familyRoomArea = familyRoomArea;
            this.livingRoomArea = livingRoomArea;
        }
        
        
        
        @Override
        public String toString() {
            return "House style = " + style + ", " +
                   "Plot = " + plot + ", " +
                   "Bedrooms = " + bedrooms + ", " +
                   "Family room area = " + familyRoomArea + ", " +
                   "Living room area = " + livingRoomArea;
        }
        
        
        public void setStyle(String style) {
            this.style = style;
        }
        
        public String getStyle() {
            return style;
        }
        
        
        
        public void setPlot(double plot) {
            this.plot = plot;
        }
        
        public double getPlot() {
            return plot;
        }
        
        
        
        public void setBedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
        }
        
        public int getBedrooms() {
            return bedrooms;
        }
        
        
        
        public void setFamilyRoomArea(double familyRoomArea) {
            this.familyRoomArea = familyRoomArea;
        }
        
        public double getFamilyRoomArea() {
            return familyRoomArea;
        }
        
        
        
        public void setLivingRoomArea(double livingRoomArea) {
            this.livingRoomArea = livingRoomArea;
        }
        
        public double getLivingRoomArea() {
            return livingRoomArea;
        }
        
        
        
        public double getTotalArea() {
            return (bedrooms * 300) + familyRoomArea + livingRoomArea;
        }
        
        public int compareArea(House otherHouse) {
            if (getTotalArea() < otherHouse.getTotalArea())
                return -1;
            
            if (getTotalArea() > otherHouse.getTotalArea())
                return 1;
            
            return 0;
        }
    }