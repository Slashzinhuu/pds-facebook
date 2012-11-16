package apifb;
import com.restfb.Connection;
import com.restfb.types.User;

public class BuscarAmigosDeAmigos {

	/**Tenta buscar e guardar as informa��es de amigos**/
	public Connection<User> buscarAmigosDeAmigos(Connection<User> friends, String name) {

		for (int i = 0; i < friends.getData().size(); i++) {
			if ((friends.getData().get(i).getName()).equals(name)) {
				Connection<User> AmigosDeAmigos = Cliente.getInstance()
						.fetchConnection(
								friends.getData().get(i).getId() + "/friends",
								User.class);
				return AmigosDeAmigos; 
			}
		}
		
		return null;
		
	}

}
