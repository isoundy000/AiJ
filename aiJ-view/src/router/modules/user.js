/** When your routing table is too long, you can split it into small modules **/

import Layout from '@/layout'

const userRouter = {
  path: '/user',
  component: Layout,
  redirect: 'noRedirect',
  name: 'UserRouter',
  meta: {
    title: '用户管理',
    icon: 'peoples'
  },
  children: [
    {
      path: 'player',
      component: () => import('@/views/user/player'),
      name: 'Player',
      meta: { title: '游戏玩家' }
    },
    {
      path: 'administrator',
      component: () => import('@/views/user/administrator'),
      name: 'Administrator',
      meta: { title: '平台用户' }
    },
    {
      path: 'distributor',
      component: () => import('@/views/user/distributor'),
      name: 'Distributor',
      meta: { title: '游戏代理' }
    },
    {
      path: 'role',
      component: () => import('@/views/user/role'),
      name: 'Role',
      meta: { title: '角色权限' }
    },
    {
      path: 'role/update',
      component: () => import('@/views/user/role/update'),
      name: 'UpdateRole',
      hidden: true,
      meta: { title: '角色权限管理', noCache: true }
    }
  ]
}

export default userRouter
