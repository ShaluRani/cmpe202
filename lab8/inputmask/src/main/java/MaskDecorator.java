
public abstract class MaskDecorator implements IDisplayComponent
{
	protected IDisplayComponent keymask ;
	
	public MaskDecorator( IDisplayComponent keymask )
	{
		this.keymask = keymask ;
	}
	
	public String display() 
	{
		return keymask.display();
	}
    public void addSubComponent( IDisplayComponent c )
    {
    	
    }


}