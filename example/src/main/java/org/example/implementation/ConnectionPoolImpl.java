package org.example.implementation;

import org.example.ConnectionPool;

import java.util.HashSet;

public class ConnectionPoolImpl implements ConnectionPool {

    static int maxConnections=40;//TODO get from @configuration

    int currentOpenConnections=0;

    //synchronized
    Set<Connection> myConnections = new HashSet<>();

    @Override
    public AbstractConnection getConnection() {
        Connection conn;

        if (currentOpenConnections>maxConnections)
        {
            return null;
        }
        if (isThereFree(myConnections))
        {
            //synchro
           Conn= getFreeConnection(myConnections);
        }
        else {
            conn = ConnectionFactory.getNerwCionnection();
            myConnections.add(conn);//status free
            currentOpenConnections++;
        }
        return conn;
    }

    @Override
    public void freeConnection(AbstractConnection abstractConnection) {

    }

    @Override
    public boolean isThereFreeConnection() {


        return false;
    }
}
