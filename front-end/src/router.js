import { createRouter, createWebHashHistory, createWebHistory } from 'vue-router';

import store from "@/store/index";

const routes = [
    {
        path: '/',
        redirect:'/main'
    },
    {
        name:'403',
        path: '/403',
        component: () => import('@/views/403'),
    },
    {
        name:'main',
        path: '/main',
        component: () => import('@/module/main/views/UMain'),
    }
];
//props向组件添加props

const router = createRouter({
    history: createWebHashHistory(),  // hash路由模式
    // history: createWebHistory(),  // history路由模式
    routes
});
export default router;