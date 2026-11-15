package oops.abstraction;

class DatabaseClient
{
    private int maxConnections;
    private int retryAttempts;

    public DatabaseClient(int maxConnections, int retryAttempts) 
	{
        this.maxConnections = maxConnections;
        this.retryAttempts = retryAttempts;
    }

    // Clean public API: the caller's view
    public void connect(String host, int port) 
	{
        openSocket(host, port);
        authenticate();
        initializeConnectionPool();
    }

    public String query(String sql) {
        String parsedQuery = parseQuery(sql);
        return executeWithRetry(parsedQuery);
    }

    // Hidden complexity: the implementation details
    private void openSocket(String host, int port) { /* TCP connection */ }
    private void authenticate() { /* Credential exchange */ }
    private void initializeConnectionPool() { /* Pool management */ }
    private String parseQuery(String sql) { return sql.trim(); }
    private String executeWithRetry(String query) {
        for (int i = 0; i < retryAttempts; i++) {
            try {
                return executeQuery(query);
            } catch (Exception e) {
                if (i == retryAttempts - 1)
                {
                    throw e;
                }
            }
        }
        return null;
    }
    private String executeQuery(String query) { return "result"; }
}