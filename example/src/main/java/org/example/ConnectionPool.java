package org.example;

public interface ConnectionPool {

    AbstractConnection getConnection();

    void freeConnection(AbstractConnection abstractConnection);

    boolean isThereFreeConnection();


}
