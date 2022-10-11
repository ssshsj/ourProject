import request from '@/request'
export const fetchItems = ({type,after}) => {
    return request({
        url:'/items',
        method :'post',
        data: {type,after},
    })
}
export const test = () => request({url:'/login', method :'post',data:{msg:'login'}})
