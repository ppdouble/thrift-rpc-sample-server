namespace java thrift.rpc.api.user
namespace cpp thrift.rpc.api.user

struct LoginRequest {
  1: string username,
  2: string password
}

struct APIResponse {
  1: string responsemessage,
  2: i32 responseCode
}

# empty for logout request
struct Empty {
}

# specific response for logout
struct LogoutResponse {
  1: string logoutmessage,
  2: i32 responseCode
}


service UserService {
  APIResponse login(1:LoginRequest loginRequest);

  LogoutResponse logout(1:Empty empty);

}