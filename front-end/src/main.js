import './plugins/bootstrap-vue'
import { createApp } from 'vue'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import store from './store'
import router from "@/router";
const app = createApp(App).use(store)
app.use(ElementPlus)
app.use(router)
app.mount('#app')
