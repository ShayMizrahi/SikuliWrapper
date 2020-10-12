package SikuliWrapper;
import java.rmi.RemoteException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliLocalClient implements SikuliActions {
	Screen screen;
	public SikuliLocalClient(Screen screen) {
		this.screen = screen;
	}
	
	public void click(String target) throws RemoteException {
		try {
			this.screen.click(target);
		} catch (FindFailed e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void rightClick(String target) throws RemoteException {
		try {
			this.screen.rightClick(target);
		} catch (FindFailed e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void wait(String target, int timeToWait) throws RemoteException {
		try {
			this.screen.wait(target, timeToWait);
		} catch (FindFailed e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void doubleClick(String target) throws RemoteException {
		try {
			this.screen.doubleClick(target);
		} catch (FindFailed e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void type(String target, String text) throws RemoteException {
		try {
			this.screen.type(target, text);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void type(String text) throws RemoteException {
		try {
			this.screen.type(text);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void find(String target) throws RemoteException {
		try {
			this.screen.find(target);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void dragDrop(String dragTarget, String dropTarget) throws RemoteException {
		try {
			this.screen.dragDrop(dragTarget, dropTarget);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void hover(String target) throws RemoteException {
		try {
			this.screen.hover(target);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
	
	public void waitVanish(String target) throws RemoteException {
		try {
			this.screen.waitVanish(target);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(),e);
		}
	}
}
