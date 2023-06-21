/**
 * 
 */
package application;

import entities.Client;

/**
 * @author Matos
 *
 */
public class ClientProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Client client1 = new Client("Jose", "jose@gmail.com");
		Client client2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(client1.hashCode());
		System.out.println(client2.hashCode());
		System.out.println(client1.equals(client2));
		
	}

}
