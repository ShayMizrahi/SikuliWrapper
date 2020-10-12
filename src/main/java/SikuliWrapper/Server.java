package SikuliWrapper;
import java.rmi.registry.Registry;

import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.awt.im.*;  


public class Server implements SikuliActions {
	Screen screen;

	public Server() {
		System.out.println("Creating Sikuli screen instance...");

		try {
			screen = new Screen();
		}
		catch(Exception ex) {
			System.out.println("Failed creating sikuli screen");
			ex.printStackTrace();
			return;
		}

		System.out.println("Sikuli screen instance created sucessfuly");
	}

	public static void main(String[] args) {
		try {
			System.out.println("Sikuli Server is Initializing...");
			Server obj = new Server();
			
			System.out.println("[Unicasting...]");
			SikuliActions stub = (SikuliActions) UnicastRemoteObject.exportObject(obj, 0);

			// Bind the remote object's stub in the registry
			System.out.println("[Connecting rmi registry...]");

			Registry registry = LocateRegistry.getRegistry();
			
			System.out.println("[Binding...]");
			registry.bind("SikuliWrapper", stub);

			System.err.println("Sikuli Wrapper Server ready");
		} catch (Exception e) {
			System.err.println("Sikuli Wrapper Server exception: " + e.toString());
			e.printStackTrace();
		}

	}

	public void click(String target) throws RemoteException {
		try {
			screen.click(target);
		} catch (FindFailed e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public void rightClick(String target) throws RemoteException {
		try {
			screen.rightClick(target);
		} catch (FindFailed e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public void wait(String target, int timeToWait) throws RemoteException {
		try {
			screen.wait(target,timeToWait);
		} catch (FindFailed e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public void doubleClick(String target) throws RemoteException {
		try {
			screen.doubleClick(target);
		} catch (FindFailed e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public void type(String target, String text) throws RemoteException {
		try {
			screen.type(target, text);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	
	public void type(String text) throws RemoteException {
		try {
			screen.type(text);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public void find(String target) throws RemoteException {
		try {
			screen.find(target);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public void dragDrop(String dragTarget, String dropTarget) throws RemoteException {
		try {
			screen.dragDrop(dragTarget, dropTarget);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public void hover(String target) throws RemoteException {
		try {
			screen.hover(target);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public void waitVanish(String target) throws RemoteException {
		try {
			screen.waitVanish(target);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage(), e);
		}

	};
	
	public String getActiveLanguag() {
		InputContext context = InputContext.getInstance();
		return context.getLocale().toString();
	}

}
