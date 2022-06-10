enum Color2{
		RED,
		GREEN,
		BLUE,
		PINK;
		
		private int i ;
		private Color2()
		{
			
			System.out.println("Contructor called " + " " + i + "  times");
			i++;
		}
		public void dispay()
		{
			System.out.println("displaying...");
		}
	  }
		class TestEnum
		{
		public static void main(String[] args) {
			Color2 c = Color2.PINK;
			c.dispay();
			System.out.println(c);
			
		}
		}