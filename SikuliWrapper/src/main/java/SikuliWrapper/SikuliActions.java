package SikuliWrapper;
import java.rmi.Remote;
import java.rmi.RemoteException;

import org.sikuli.script.FindFailed;

public interface SikuliActions extends Remote {
	void click(String target) throws RemoteException;
	void rightClick(String target) throws RemoteException;
	void wait(String target, int timeToWait) throws RemoteException;
	void doubleClick(String target) throws RemoteException;
	void type(String target, String text) throws RemoteException;
	void type(String text) throws RemoteException;
	void find(String target) throws RemoteException;
	void dragDrop(String dragTarget, String dropTarget) throws RemoteException;
	void hover(String target) throws RemoteException;
	void waitVanish(String target) throws RemoteException;
	

}
