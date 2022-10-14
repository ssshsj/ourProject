<template>
  <div>
    <h2>前端技术大作业</h2>
    <el-button @click="getAccount">获取小明的账号</el-button>
  </div>
</template>

<script>
import {test} from "@/module/main/api/api";

export default {
  name: "UTest",
  methods:{
    getAccount(){
      test('小明').then((res)=>{
        alert('小明的账号:'+res.userAccount)
      })
    }
  }
}
</script>

<style scoped>

</style>