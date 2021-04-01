import grpc from 'k6/net/grpc';
import { check, sleep } from 'k6';

const client = new grpc.Client();

client.load(['definitions'], 'Teams.proto');

export default () => {
  client.connect('localhost:9090', {
     plaintext: true
  });

  const data = { name: 'Test5' };

  const response = client.invoke('TeamService/CreateTeam', data);
  check(response, {
    'status is OK': (r) => r && r.status === grpc.StatusOK,
  });
  console.log(JSON.stringify(response.message));
  client.close();
  sleep(1);
};
