package Insurance.Service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import Insurance.DAO.Impl.RoleDAOImpl;
import Insurance.DTO.RoleDTO;
import Insurance.Entities.Role;

@Path("role-service")
public class RoleService {
	Gson son = new Gson();

	@GET
	@Path("/getAllRole")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllRole() {
		List<Role> listRole = new RoleDAOImpl().getAllRole();
		List<RoleDTO> listData = new ArrayList<RoleDTO>();
		for (Role r : listRole) {
			RoleDTO roleDTO = new RoleDTO(r.getIdRole(),r.getNameRole(),r.getStatusRole(),r.getCreated_at_Role());
			listData.add(roleDTO);
		}
		String data = son.toJson(listData);
		return data;
	}	
	
	@GET
	@Path("/getRoleById/{idRole}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getRoleById(@PathParam("idRole")Integer idRole) {
		Role r = new RoleDAOImpl().getRoleById(idRole);
		RoleDTO roleDTO = new RoleDTO(r.getIdRole(),r.getNameRole(),r.getStatusRole(),r.getCreated_at_Role());
		String data = son.toJson(roleDTO);
		return data;
	}
	

	@POST
	@Path("/insertRole")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertRole(String jsonRole) {
		RoleDTO roleDTO = son.fromJson(jsonRole, RoleDTO.class);
		Role role = new Role(0,roleDTO.getNameRole(),roleDTO.getStatusRole(),roleDTO.getCreated_at_Role(), null);
		boolean bl = new RoleDAOImpl().insertRole(role);
		String data = son.toJson(bl);
		return data;
	}
	
	@PUT
    @Path("/updateRole")
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateRole(String jsonRole) {
        RoleDTO roleDTO = son.fromJson(jsonRole, RoleDTO.class);
        Role role = new Role(0,roleDTO.getNameRole(),roleDTO.getStatusRole(),roleDTO.getCreated_at_Role(), null);
        boolean bl = new RoleDAOImpl().updateRole(role);
        String data = son.toJson(bl);
        return data;
    }
	
	@POST
    @Path("/deleteRole/{idRole}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String deleteRole(@PathParam("idRole")Integer idRole) {
        boolean bl = new RoleDAOImpl().deleteRole(idRole);
        String data = son.toJson(bl);
        return data;
    }
	
	@GET
    @Path("/getRoleByName/{nameRole}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getRoleByName(@PathParam("nameRole")String nameRole) {
        List<Role> listRoles = new RoleDAOImpl().searchRoleName(nameRole);
        List<RoleDTO> listData = new ArrayList<RoleDTO>();
        for (Role r : listRoles) {
            RoleDTO roleDTO = new RoleDTO(r.getIdRole(),r.getNameRole(),r.getStatusRole(),r.getCreated_at_Role());
            listData.add(roleDTO);
        }
        String data = son.toJson(listRoles);
        return data;
	}

}
