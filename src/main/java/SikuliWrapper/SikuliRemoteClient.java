package SikuliWrapper;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SikuliRemoteClient implements SikuliActions {
	String host = "";
	public SikuliRemoteClient(String host) {
		this.host = host;
	}

	public void click(String target) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.click(target);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void rightClick(String target) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.rightClick(target);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void wait(String target, int timeToWait) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.wait(target, timeToWait);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void doubleClick(String target) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.doubleClick(target);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void type(String target, String text) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.type(target, text);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void type(String text) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.type(text);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void find(String target) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.find(target);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void dragDrop(String dragTarget, String dropTarget) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.dragDrop(dragTarget, dropTarget);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void hover(String target) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.hover(target);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
	
	public void waitVanish(String target) throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(this.host);
            SikuliActions stub = (SikuliActions) registry.lookup("SikuliWrapper");
            stub.waitVanish(target);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
            throw new RemoteException(e.getMessage(),e);
        }
	};
}
