import axios from "axios";

const API = axios.create({
  baseURL: "https://tourist-review-mongodb.onrender.com",
});

export default API;