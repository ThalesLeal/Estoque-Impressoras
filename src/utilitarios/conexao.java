package utilitarios;
import java.sql.*;
import javax.swing.*;

public class conexao{
    
    final private String driver ="";
    final private String url="";
    final private String usuario ="";
    final private String senha ="";
    private Connection conexao;
    
    public Statement statement;
    public ResultSet resultSet;
}