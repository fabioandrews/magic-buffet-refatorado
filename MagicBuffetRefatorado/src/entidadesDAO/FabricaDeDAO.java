package entidadesDAO;


import InterfaceDAO.DAOComBuscaMultiplaInterface;
import InterfaceDAO.GenericDAOInterface;

public class FabricaDeDAO 
{
	public static DAOComBuscaMultiplaInterface criarTemaDAO()
	{
		DAOComBuscaMultiplaInterface dao = new TemaDAO();
		return dao;
	}
	
	public static DAOComBuscaMultiplaInterface criarPacoteDAO()
	{
		DAOComBuscaMultiplaInterface dao = new PacoteDAO();
		return dao;
	}
	
	public static DAOComBuscaMultiplaInterface criarFestaDAO()
	{
		DAOComBuscaMultiplaInterface dao = new FestaDAO();
		return dao;
	}
	
	public static GenericDAOInterface criarPessoaDAO()
	{
		GenericDAOInterface dao = new PessoaDAO();
		return dao;
	}
	
	public static DAOComBuscaMultiplaInterface criarLocalizacaoDAO()
	{
		DAOComBuscaMultiplaInterface dao = new LocalizacaoDAO();
		return dao;
	}
	
	public static DAOComBuscaMultiplaInterface criarItemDAO()
	{
		DAOComBuscaMultiplaInterface dao = new ItemDAO();
		return dao;
	}
	
	
	//criacao de DAOs concretos
	public static GerenteDAO criarGerenteDAO()
	{
		return new GerenteDAO();
	}
	
	public static FestaDAO criarFestaDAOConcreto()
	{
		return new FestaDAO();
	}
	
	public static ItemDAO criarItemDAOConcreto()
	{
		return new ItemDAO();
	}
	
	public static PacoteDAO criarPacoteDAOConcreto()
	{
		return new PacoteDAO();
	}
	
	public static PessoaDAO criarPessoaDAOConcreto()
	{
		return new PessoaDAO();
	}
	
}
