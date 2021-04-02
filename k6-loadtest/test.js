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


export let options = {
  summaryTrendStats: ['avg', 'min', 'med', 'max', 'p(95)', 'p(99)', 'p(99.99)', 'count'],
  stages: [
     { duration: '10s', target: 10 }, // simulate ramp-up of traffic from 1 to 100 users over 5 minutes.
    { duration: '20m', target: 10 }, // stay at 100 users for 10 minutes
    // { duration: '5m', target: 0 }, // ramp-down to 0 users
  ],
  thresholds: {
    http_req_duration: ['p(99)<1500'], // 99% of requests must complete below 1.5s
    'logged in successfully': ['p(99)<1500'], // 99% of requests must complete below 1.5s
  },
};
// const BASE_URL = 'https://test-api.k6.io';
// const USERNAME = 'TestUser';
// const PASSWORD = 'SuperCroc2020';
// export default () => {
//   let loginRes = http.post(`${BASE_URL}/auth/token/login/`, {
//     username: USERNAME,
//     password: PASSWORD,
//   });
//   check(loginRes, {
//     'logged in successfully': (resp) => resp.json('access') !== '',
//   });
//   let authHeaders = {
//     headers: {
//       Authorization: `Bearer ${loginRes.json('access')}`,
//     },
//   };
//   let myObjects = http.get(`${BASE_URL}/my/crocodiles/`, authHeaders).json();
//   check(myObjects, { 'retrieved crocodiles': (obj) => obj.length > 0 });
//   sleep(1);
// };
