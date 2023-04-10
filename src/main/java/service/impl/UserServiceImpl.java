package service.impl;

import thrift.rpc.api.user.*;

public class UserServiceImpl implements UserService.Iface {
    @Override
    public APIResponse login(LoginRequest loginRequest) throws org.apache.thrift.TException {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // mock data
        String usr = "nick";
        String pass = "npass";

        APIResponse apiResponse = new APIResponse();

        // business logic
        if (usr.equals(username) && pass.equals(password)) {
            apiResponse.setResponseCode(1).setResponsemessage("Login Success");
        } else {
            apiResponse.setResponseCode(0).setResponsemessage("Login Failure: In valid username or password");
        }

        return apiResponse;
    }

    @Override
    public LogoutResponse logout(Empty empty) throws org.apache.thrift.TException {

        LogoutResponse logoutResponse = new LogoutResponse();
        logoutResponse.setResponseCode(1).setLogoutmessage("Status: Logout");

        return logoutResponse;
    }
}
