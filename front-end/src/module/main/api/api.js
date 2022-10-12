import request from '@/request'
export const test = (userName) => request({url:'/user/test', method :'post',params:{userName}})
