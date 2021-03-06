    class Rectangle5 extends Shape5 {
        @Override
        public String draw() {
            return "Rectangle drawn :";
        }
    }

    class Line5 extends Shape5{
        @Override
        public String draw() {
            return "line drawn :";
        }
    }

    class Cube5 extends Shape5 {
        @Override
        public String draw() {
            return "Cube drawn :";
        }
    }
    abstract class Shape5 {
        abstract public String draw();
    }
    public class OOPS5 extends Shape5{
        public static void main(String[] args) {
        	OOPS5 obj = new OOPS5();
        	obj.draw();
        }

		@Override
		public String draw() {
			return null;
		}
    }
