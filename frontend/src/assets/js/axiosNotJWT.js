import axios from 'axios'
const serverURL = 'https://i5a108.p.ssafy.io/api'
// https://i5a108.p.ssafy.io/api
// http://localhost:8080

// axios 객체 생성
export default axios.create({
  baseURL: serverURL,
})
