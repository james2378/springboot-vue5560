import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import wuzishenling from '@/views/modules/wuzishenling/list'
    import yonghu from '@/views/modules/yonghu/list'
    import wuzixinxi from '@/views/modules/wuzixinxi/list'
    import wuziruku from '@/views/modules/wuziruku/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import wuzichuku from '@/views/modules/wuzichuku/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/wuzishenling',
        name: '物资申领',
        component: wuzishenling
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/wuzixinxi',
        name: '物资信息',
        component: wuzixinxi
      }
      ,{
	path: '/wuziruku',
        name: '物资入库',
        component: wuziruku
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/wuzichuku',
        name: '物资出库',
        component: wuzichuku
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
