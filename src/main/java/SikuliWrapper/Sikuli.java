package SikuliWrapper;

import java.rmi.RemoteException;
import org.sikuli.script.FindFailed;

public class Sikuli {
	SikuliActions innerClient;
	public Sikuli(SikuliActions sikuliRemoteOrLocal) {
		this.innerClient = sikuliRemoteOrLocal;
	}
	
	public void click(String target) throws RemoteException {
		try {
			this.innerClient.click(target);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void rightClick(String target) throws RemoteException {
		try {
			this.innerClient.rightClick(target);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void wait(String target, int timeToWait) throws RemoteException {
		try {
			this.innerClient.wait(target, timeToWait);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void doubleClick(String target) throws FindFailed, RemoteException {
		try {
			this.innerClient.doubleClick(target);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void type(String target, String text) throws RemoteException   {
		try {
			this.innerClient.type(target, text);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void type(String text) throws RemoteException    {
		try {
			this.innerClient.type(text);
		} catch (RemoteException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void find(String target) throws FindFailed, RemoteException {
		try {
			this.innerClient.find(target);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void dragDrop(String dragTarget, String dropTarget) throws RemoteException {
		try {
			this.innerClient.dragDrop(dragTarget, dropTarget);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void hover(String target) throws RemoteException {
		try {
			this.innerClient.hover(target);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public void waitVanish(String target) throws RemoteException {
		try {
			this.innerClient.waitVanish(target);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
}
