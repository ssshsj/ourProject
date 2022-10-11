import axios from "axios";//原生的axios
//创建一个单例
const http= axios.create({
    baseURL:'/api',
    timeout:5000,//响应时间

})

//拦截器  -请求拦截
// http.interceptors.request.use(config=>{
//     //部分接口需要token
//     let token=localStorage.getItem('token');
//     if(token){
//         config.headers.token=token;
//         // config.headers ={
//         // 'token':token
//         // }
//     }
//     return config;
// },err=>{
//     return Promise.reject(err)
// })

//拦截器  -响应拦截
// http.interceptors.response.use(res=>{
//     if(res.data.code===200){
//         return Promise.resolve(res.data)
//         //这里读者们可以根据服务器返回的数据去自行修改
//     }else{
//         return Promise.reject(res.data)
//     }
// },err=>{
//     return Promise.reject(err)
// });
http.interceptors.response.use(res=>{
    //res对实际的data有一层data封装
    if (res.status===200) return Promise.resolve(res.data)
    return Promise.reject(res.data)
},err=>{
    return Promise.reject(err)
});

//整体导出
export default http;
