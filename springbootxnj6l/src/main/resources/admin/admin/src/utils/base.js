const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootxnj6l/",
            name: "springbootxnj6l",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "应急救援物资管理系统"
        } 
    }
}
export default base
