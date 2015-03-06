public class BlueShapeDecorator extends ShapeDecorator
{

		public BlueShapeDecorator( Shape decoratedShape )
		{
				super(decoratedShape);
		}

		@Override
		public void draw()
		{
				decoratedShape.draw();
				setColor(decoratedShape);
		}

		private void setColor( Shape decoratedShape )
		{
				System.out.println("Color: Blue has been applied to "+decoratedShape);
		}
}